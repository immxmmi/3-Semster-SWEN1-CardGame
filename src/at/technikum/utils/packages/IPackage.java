package at.technikum.utils.packages;

import at.technikum.utils.card.ICard;

import java.util.ArrayList;

public interface IPackage {

    String getPackageID();

    ArrayList<ICard> getCards();

    int getPrice();

    String getDate();

}
