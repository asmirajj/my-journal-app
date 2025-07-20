package com.myJournal.journalApp.repository;


import com.myJournal.journalApp.entity.JournalEntry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JournalEntryRepository extends JpaRepository<JournalEntry, Long> {
    // No need to write any methods unless you want custom queries.
}
