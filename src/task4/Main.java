package task4;

import java.util.Scanner;

public class Main {

    private static int proLicense = 111;
    private static int expLicense = 222;

    public static void main(String[] args) {
        Scanner hw = new Scanner(System.in);
        System.out.print("Enter the license key - ");
        int license = hw.nextInt();

        if (license == proLicense) {
            ProDocumentWorker worker = new ProDocumentWorker();
            while (true) {
                System.out.println("Enter Command (o/e/s/q): ");
                String com = hw.next();
                switch (com) {
                    case "o":
                        worker.openDocument();
                        break;
                    case "e":
                        worker.editDocument();
                        break;
                    case "s":
                        worker.saveDocument();
                        break;
                    case "q":
                        return;
                }

            }
        } else if (license == expLicense) {
            ExpertDocumentWorker worker = new ExpertDocumentWorker();
            while (true) {
                System.out.println("Enter Command (o/e/s/q): ");
                String com = hw.next();
                switch (com) {
                    case "o":
                        worker.openDocument();
                        break;
                    case "e":
                        worker.editDocument();
                        break;
                    case "s":
                        worker.saveDocument();
                        break;
                    case "q":
                        return;
                }
        }

        } else {
            DocumentWorker worker = new DocumentWorker();
            while (true) {
                System.out.println("Enter Command (o/e/s/q): ");
                String com = hw.next();
                switch (com) {
                    case "o":
                        worker.openDocument();
                        break;
                    case "e":
                        worker.editDocument();
                        break;
                    case "s":
                        worker.saveDocument();
                        break;
                    case "q":
                        return;
                }
        }
    }
}
}
