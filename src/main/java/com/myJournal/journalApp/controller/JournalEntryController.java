package com.myJournal.journalApp.controller;

import com.myJournal.journalApp.entity.JournalEntry;
import com.myJournal.journalApp.repository.JournalEntryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/journal")
public class JournalEntryController {
    //private Map<Long, JournalEntry> journalEntries = new HashMap<>();
    @Autowired
    private JournalEntryRepository repository;

    @GetMapping //("/getEntries")
    public List<JournalEntry> getAll(){
        return repository.findAll();
    }

    @PostMapping  //("/putEntry")
    public JournalEntry createEntry(@RequestBody JournalEntry myEntry){
        //journalEntries.put(myEntry.getId(),myEntry);
        return repository.save(myEntry);
    }
    @GetMapping("/id/{myId}")
    public JournalEntry getJournalEntryById(@PathVariable Long myId){
        return repository.findById(myId).orElse(null);
    }

    @DeleteMapping("/id/{myId}")
    public void deleteJournalEntryById(@PathVariable Long myId){
        //journalEntries.remove(myId);
        repository.deleteById(myId);
    }
    @PutMapping("/id/{myId}")
    public JournalEntry updateEntryById(@PathVariable Long myId,@RequestBody JournalEntry myEntry){
        Optional<JournalEntry> existing = repository.findById(myId);
        if(existing.isPresent()){
            JournalEntry entry = existing.get();
            entry.setTitle(myEntry.getTitle());
            entry.setContent(myEntry.getContent());
            return repository.save(entry);
        }else{
            return null;
        }
        //return journalEntries.put(myId,myEntry);
    }
}
