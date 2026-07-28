package com.shabik.spring_ai_phase2.serviceimp;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.memory.ChatMemory;
import org.springframework.stereotype.Service;

import com.shabik.spring_ai_phase2.service.ChatService;

@Service
public class ChatServiceImp implements ChatService {

    private final ChatClient chatClient;

    public ChatServiceImp(ChatClient chatClient) {
        this.chatClient = chatClient;
    }

    @Override
    public String chat(String conversationId, String message) {

        return chatClient
                .prompt()
                .advisors(advisor ->
                        advisor.param(ChatMemory.CONVERSATION_ID, conversationId))
                .user(message)
                .call()
                .content();
    }
}