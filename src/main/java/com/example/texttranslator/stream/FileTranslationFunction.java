package com.example.texttranslator.stream;

import com.example.texttranslator.payload.MessageFileDto;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class FileTranslationFunction {

    @Bean
    public Function<MessageFileDto, MessageFileDto> textTranslation() {
        return (message) -> {

            // Use google translate api or something else translation service

            return message;
        };
    }
}
