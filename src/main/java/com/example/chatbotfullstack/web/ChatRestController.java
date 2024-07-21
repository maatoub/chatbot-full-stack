package com.example.chatbotfullstack.web;

import com.example.chatbotfullstack.services.ChatAiService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/chat")
public class ChatRestController {

    private ChatAiService chatAiService;

    public ChatRestController(ChatAiService chatAiService) {
        this.chatAiService = chatAiService;
    }

    @GetMapping(value = "/ask", produces = MediaType.TEXT_PLAIN_VALUE)
    public String ask(String question) {
        return chatAiService.ragChat(question);
    }

    @GetMapping(value = "/qst", produces = MediaType.TEXT_PLAIN_VALUE)
    public String askIllm(String question) {
        return chatAiService.askIllm(question);
    }

}