package com.Chat.ChatApp.Model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ChatMessage {

    private Long id;
    String sender;
    String Content;
}
