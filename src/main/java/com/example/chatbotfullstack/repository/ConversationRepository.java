package com.example.chatbotfullstack.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.example.chatbotfullstack.entities.Conversation;
import com.example.chatbotfullstack.entities.Person;

import java.util.List;

public interface ConversationRepository
        extends JpaRepository<Conversation, Long>, JpaSpecificationExecutor<Conversation> {
    List<Conversation> findByPerson(Person person);
}