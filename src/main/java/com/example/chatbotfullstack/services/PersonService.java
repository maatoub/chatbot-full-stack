package com.example.chatbotfullstack.services;

import com.example.chatbotfullstack.entities.Person;
import com.example.chatbotfullstack.repository.PersonRepository;
import com.vaadin.flow.server.auth.AnonymousAllowed;
import com.vaadin.hilla.BrowserCallable;
import com.vaadin.hilla.crud.CrudRepositoryService;

@BrowserCallable
@AnonymousAllowed
public class PersonService extends CrudRepositoryService<Person, Long, PersonRepository> {
}