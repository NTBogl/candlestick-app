# 📊 Real-Time Candlestick WebSocket App

Учебный проект, демонстрирующий **обновление графика в реальном времени** на основе данных, поступающих через **WebSocket (STOMP + SockJS)**. График отображается на клиенте с помощью **Chart.js**.

---

### 🚀 Функциональность

- Отображение данных о свечах (цена открытия, закрытия, high, low)
- Поддержка реального времени (WebSocket)
- Визуализация с использованием `Chart.js`
- Эндпоинт для отправки новых данных о свечах через POST-запрос

---

### 🧰 Технологии

| Backend (Spring Boot)   | Frontend (HTML + JS)        |
|-------------------------|-----------------------------|
| Java 17                 | Vanilla JS + Bootstrap      |
| Spring Boot 3.x         | Chart.js (графики)          |
| WebSocket + STOMP       | SockJS + STOMP.js           |
| Spring Messaging        | HTML5 Canvas                |

---

### 📦 Как запустить

1. **Склонировать проект**  
   ```bash
   git clone https://github.com/NTBogl/candlestick-app.git
   cd candlestick-app
