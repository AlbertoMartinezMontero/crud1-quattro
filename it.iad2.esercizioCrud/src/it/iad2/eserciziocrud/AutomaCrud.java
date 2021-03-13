package it.iad2.eserciziocrud;

public class AutomaCrud implements State {

    private State stato;
    private Prodotto prodotto;
    UIAutomabileCrud gui;

    public AutomaCrud() {
        stato = new RicercaState();
    }

    @Override
    public void next(Event e) {
        System.out.println("Siamo in" + stato);
        System.out.println("Evento:" + e);
        stato.next(e);
        System.out.println("Arrivati in" + stato + "\n");
    }

    public class RicercaState implements State {

        @Override
        public void next(Event e) {
            if (e instanceof AddEvent) {
                stato = new AggiungiState();
            } else if (e instanceof SelezionaEvent) {
                stato = new VisualizzaState();
            } else if (e instanceof RicercaEvent) {
                System.out.println("Ho aggiornato la tabella");
            } else {
                System.out.println("Evento inatteso");
            }

        }

    }

    public class AggiungiState implements State {

        @Override
        public void next(Event e) {
            if (e instanceof AnnullaEvent) {
                stato = new RicercaState();
            } else if (e instanceof ConfermaEvent) {
                stato = new VisualizzaState();
            } else {
                System.out.println("Evento inatteso");
            }

        }
    }

    public class VisualizzaState implements State {

        @Override
        public void next(Event e) {
            if (e instanceof AddEvent) {
                stato = new AggiungiState();
            } else if (e instanceof ModificaEvent) {
                stato = new ModificaState();
            } else if (e instanceof RimuoviEvent) {
                stato = new RimuoviState();
            } else if (e instanceof RicercaEvent) {
                stato = new RicercaState();
            } else if (e instanceof SelezionaEvent) {
                stato = new VisualizzaState();
            } else {
                System.out.println("Evento inatteso");
            }
        }
    }

    public class ModificaState implements State {

        @Override
        public void next(Event e) {
            if (e instanceof AnnullaEvent) {
                stato = new VisualizzaState();
            } else if (e instanceof ConfermaEvent) {
                stato = new VisualizzaState();
            } else {
                System.out.println("Evento inatteso");
            }
        }
    }

    public class RimuoviState implements State {

        @Override
        public void next(Event e) {
            if (e instanceof ConfermaEvent) {
                stato = new RicercaState();
            } else if (e instanceof AnnullaEvent) {
                stato = new VisualizzaState();
            } else {
                System.out.println("Evento inatteso");
            }

        }
    }
}
