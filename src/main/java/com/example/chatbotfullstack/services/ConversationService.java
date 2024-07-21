package com.example.chatbotfullstack.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.chatbotfullstack.entities.Conversation;
import com.example.chatbotfullstack.entities.Person;
import com.example.chatbotfullstack.repository.ConversationRepository;

import java.util.List;

@Service
public class ConversationService {

    @Autowired
    private ConversationRepository conversationRepository;

    public List<Conversation> getConversationsByPerson(Person person) {
        return conversationRepository.findByPerson(person);
    }

    public Conversation saveConversation(Conversation conversation) {
        return conversationRepository.save(conversation);
    }
}