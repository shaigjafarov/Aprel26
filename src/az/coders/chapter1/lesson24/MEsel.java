package az.coders.chapter1.lesson24;

public class MEsel {
    private  boolean flag = false;

    public void startProcess() {
        System.out.println("İşlem başlatılıyor...");
        flag = true;
    }

    public void stopProcess() {
        System.out.println("İşlem durduruluyor...");
        flag = false;
    }

    public void process() {
        while (flag) {
            // İşlem devam ediyor...
            System.out.println("İşlem çalışıyor...");
        }
        System.out.println("İşlem durdu.");
    }

    public static void main(String[] args) {
        MEsel example = new MEsel();

        // İşlemi başlatma
        example.startProcess();

        // İşlem thread'inde çalıştırma
        Thread processThread = new Thread(() -> example.process());
        processThread.start();

        try {
            // 1 saniye sonra işlemi durdurma
            Thread.sleep(1000);
            example.stopProcess();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
