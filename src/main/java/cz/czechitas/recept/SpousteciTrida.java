package cz.czechitas.recept;

import cz.czechitas.recept.naradi.ElektrickaTrouba;
import cz.czechitas.recept.naradi.Miska;
import cz.czechitas.recept.naradi.Mixer;
import cz.czechitas.recept.naradi.PlechNaPeceni;
import cz.czechitas.recept.naradi.Vaha;
import cz.czechitas.recept.suroviny.Cukr;
import cz.czechitas.recept.suroviny.Maslo;
import cz.czechitas.recept.suroviny.Mouka;
import cz.czechitas.recept.suroviny.Ovoce;
import cz.czechitas.recept.suroviny.PrasekDoPeciva;
import cz.czechitas.recept.suroviny.Vajicka;

public class SpousteciTrida {

  public static void main(String[] args) {
    Miska cervenaMiska;
    Miska zlutaMiska;
    Mixer mixer;
    Vaha kuchynskaVaha;
    PlechNaPeceni plech;
    ElektrickaTrouba trouba;
    Vajicka vajicka;

    Ovoce ovoce;
    Maslo maslo125g;
    Mouka pytlikMouky;
    Cukr pytlikCukru;
    PrasekDoPeciva prasekDoPeciva;

    cervenaMiska = new Miska("cervenaMiska");
    zlutaMiska = new Miska("zlutaMiska");
    mixer = new Mixer("mixer");
    kuchynskaVaha = new Vaha("vaha");
    plech = new PlechNaPeceni("plech");
    trouba = new ElektrickaTrouba("trouba");

    vajicka = new Vajicka("vajicka");
    ovoce = new Ovoce("ovoce");
    maslo125g = new Maslo("maslo125g");
    pytlikMouky = new Mouka("pytlikMouky");
    pytlikCukru = new Cukr("pytlikCukru");
    prasekDoPeciva = new PrasekDoPeciva("prasekDoPeciva");

    //---------------------------------------------------------------------

    // TODO: Sem napiste recept na bublaninu
    // Pouzivejte napovidani v editoru.
    // Vyskakuje samo nebo pomoci Ctrl+Mezernik


    for (int i = 0; i < 4; i++) {
      cervenaMiska.nalozSiJedenKus(vajicka);
    }
    cervenaMiska.nalozSiCelyObsah(pytlikCukru);
    mixer.zamichej(cervenaMiska);
    cervenaMiska.nalozSiJedenKus(maslo125g);
    mixer.zamichej(cervenaMiska);

    kuchynskaVaha.vynulujSeS(zlutaMiska);
    zlutaMiska.nalozSiTrochu(pytlikMouky); //nejdřív přidám trochu mouky
    while (kuchynskaVaha.zjistiHmotnost(zlutaMiska) != 250) { //opakuje se dokud váha není 250
      int hmotnost = kuchynskaVaha.zjistiHmotnost(zlutaMiska);
      System.out.println(hmotnost);
      if (hmotnost > 250) {
        zlutaMiska.vylozSiTrochu();
      } else {zlutaMiska.nalozSiTrochu(pytlikMouky);}
    }

    cervenaMiska.nalozSiObsahJineMisky(zlutaMiska);
    cervenaMiska.nalozSiCelyObsah(prasekDoPeciva);
    mixer.zamichej(cervenaMiska);

    plech.preberSiObsah(cervenaMiska);
    for (int i = 0; i < 50; i++) {
      plech.posypSeKusem(ovoce);
    }

    trouba.zapniSe(180);
    trouba.nechejPect(5);
    trouba.vlozSiDovnitr(plech);
    trouba.nechejPect(25);
    trouba.vypniSe();
    trouba.vyndejObsahVen();





  }

}
