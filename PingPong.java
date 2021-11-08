public class PingPong extends Thread {

    static public boolean ping = true;
    static class PingPongThread extends Thread {
        public boolean Ping;

        public PingPongThread(boolean Ping) {
            this.Ping = Ping;
        }

        @Override // Так как в Java уже есть встроенный метод run() для потоков
        public void run() {
            while (true){
                if (ping == Ping) {
                    if (ping)
                        System.out.println("Ping");
                    else
                        System.out.println("Pong");
                    ping = !ping;
                }
                try {  // При отсутствии исключений:
                    Thread.sleep(1000);  // Добавление остановок при выводе
                } catch (InterruptedException e) { // В случае исключения
                    e.printStackTrace(); // Указание строки, в которой метод вызвал исключение
                }
            }
        }
    }

    public static void main(String[] args) {
        PingPongThread k = new PingPongThread(true);
        PingPongThread k_2 = new PingPongThread(false);
        k.start();
        k_2.start();

    }
}


