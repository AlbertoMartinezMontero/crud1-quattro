package it.iad2.eserciziocrud;

public class AutomaCrud implements State {

    private State stato;
    private Prodotto prodotto;
    UIAutomabileCrud gui;

    public AutomaCrud(UIAutomabileCrud gui) {
        this.gui = gui;
        stato = new AggiungiState();
    }

    @Override
    public void next(Event e) {
        System.out.println("Siamo in" + stato);
        System.out.println("Evento:" + e);
        stato.next(e);
        System.out.println("Arrivati in" + stato + "\n");
    }

    public class RicercaState implements State {

        public RicercaState() {
            gui.vaiStatoRicerca();
            //presumo che ci vada uno stato messaggio,ma non ho capito cosa fa il metodo in concreto
        }
        
        

        @Override
        public void next(Event e) {
            if (e instanceof AddEvent) {
                stato = new AggiungiState();
            } else if (e instanceof SelezionaEvent) {
                stato = new VisualizzaState();
            } else if (e instanceof RicercaEvent) {
                System.out.println("Ho aggiornato la tabella");
                // //presumo che ci vada uno stato messaggio,ma non ho capito cosa fa il metodo in concreto
            } else {
                System.out.println("Evento inatteso");
            }

        }

    }

    public class AggiungiState implements State {

        public AggiungiState() {
            gui.vaiStatoAggiungi();
        }
        
        

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

        public VisualizzaState() {
            gui.vaiStatoVisualizza();
        }
        
        

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

        public ModificaState() {
            gui.vaiStatoModifica();
        }
        
        

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

        public RimuoviState() {
            gui.vaiStatoRimuovi();
        }
        
        

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
