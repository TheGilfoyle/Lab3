import static enums.Month.*;
import static enums.Mood.DISSATISFIED;
import static enums.Mood.FRIENDLY;

import animals.Animal;
import static etc.FondOfWelberg.*;
import animals.Mouse;
import enums.ResultsOfBoardOfDirectors;
import etc.ScientificWork;
import people.*;
import places.Cabinet;
import places.Cage;
import places.Lab;
import places.Labyrinth;
import records.Date;
import etc.BoardOfDirectors;

public class Main {
    public static void main(String[] args) {
        Date date = new Date(12, JULY);
        date.print();
        Cage cage = new Cage("клетка");
        Animal mouse = new Mouse("Элджернон");
        cage.beInCage(mouse);
        Nemur nemur = new Nemur("Немур");
        Person strauss = new Strauss("Штраус");
        Bart bart = new Bart("Барт");
        RandomPerson randomPerson1 = new RandomPerson();
        RandomPerson randomPerson2 = new RandomPerson();
        Cabinet cabinet = new Cabinet("кабинет");
        cabinet.beInCabinet(nemur, strauss, bart, randomPerson1, randomPerson2);
        nemur.setWaitingTime(5);
        strauss.setWaitingTime(5);
        bart.setWaitingTime(5);
        randomPerson1.setWaitingTime(5);
        randomPerson2.setWaitingTime(5);
        Charly charly = new Charly("Чарли");
        charly.walk();
        cabinet.beInCabinet(charly);
        nemur.pretend(FRIENDLY);
        strauss.pretend(FRIENDLY);
        bart.pretend(FRIENDLY);
        randomPerson1.pretend(FRIENDLY);
        randomPerson2.pretend(FRIENDLY);
        bart.take(mouse);
        charly.handshake(charly,nemur);
        nemur.setMood(DISSATISFIED);
        charly.handshake(charly,strauss);
        charly.walk();
        charly.handshake(charly,bart);
        charly.walk();
        charly.handshake(charly,randomPerson1);
        charly.walk();
        charly.handshake(charly,randomPerson2);
        charly.walk();
        getAnAppealFrom(charly);
        ScientificWork scientificWork = new ScientificWork();
        scientificWork.isItMine(charly);
        charly.reportFrom(scientificWork);
        nemur.reportTo(scientificWork);
        scientificWork.setTime(3);
        scientificWork.enoughTime();
        scientificWork.setTime(15);
        BoardOfDirectors boardOfDirectors = new BoardOfDirectors();
        boardOfDirectors.setResult(ResultsOfBoardOfDirectors.APPROVED);
        boardOfDirectors.getResult();
        nemur.handshake(nemur,charly);
        nemur.getMood();
        nemur.pretend(FRIENDLY);
        charly.setScienceExperience(0);
        scientificWork.isItMine(nemur);
        scientificWork.setTime(3);
        scientificWork.setSuccess(scientificWork.enoughTime());
        charly.walk();
        nemur.walk();
        bart.walk();
        Lab lab = new Lab();
        lab.beInLab(nemur, charly, bart);
        Labyrinth labyrinth = new Labyrinth("Лабиринт №1", 100);
        bart.letItGo(mouse, labyrinth);
    }
}