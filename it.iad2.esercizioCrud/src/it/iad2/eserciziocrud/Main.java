package it.iad2.eserciziocrud;

public class Main {

    public static void main(String[] args) {
        AutomaCrud auc = new AutomaCrud();
        auc.next(new ConfermaEvent());
        auc.next(new SelezionaEvent());
        auc.next(new RicercaEvent());
        auc.next(new AddEvent());
        auc.next(new ModificaEvent());
        auc.next(new RimuoviEvent());
        auc.next(new AnnullaEvent());
    }
    
}
