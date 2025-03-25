package com.example.candlestick.controller;

import com.example.candlestick.model.Candle;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/candles")
public class CandleController {

    private final List<Candle> candles = new ArrayList<>();
    private final SimpMessagingTemplate messagingTemplate;

    public CandleController(SimpMessagingTemplate messagingTemplate) {
        this.messagingTemplate = messagingTemplate;
    }

    @GetMapping
    public List<Candle> getAllCandles() {
        return candles;
    }

    @PostMapping
    public void addCandle(@RequestBody Candle candle) {
        candles.add(candle);
        // Отправка новой свечи через WebSocket
        messagingTemplate.convertAndSend("/topic/candles", candle);
    }
}
