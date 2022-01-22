package org.wecancodeit.gardeninginazip;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.wecancodeit.gardeninginazip.models.Hardiness;
import org.wecancodeit.gardeninginazip.models.Plant;
import org.wecancodeit.gardeninginazip.models.Type;
import org.wecancodeit.gardeninginazip.storage.HardinessStorage;
import org.wecancodeit.gardeninginazip.storage.PlantStorage;
import org.wecancodeit.gardeninginazip.storage.TypeStorage;

@Component
public class Populator implements CommandLineRunner {

    PlantStorage plantStore;
    HardinessStorage hardStore;
    TypeStorage typeStore;

    public Populator(PlantStorage plantStore, HardinessStorage hardStore, TypeStorage typeStore) {
        this.plantStore = plantStore;
        this.hardStore = hardStore;
        this.typeStore = typeStore;
    }

    @Override
    public void run(String... args) throws Exception{

        Hardiness oneA = new Hardiness("1a");
        Hardiness oneB = new Hardiness("1b");
        Hardiness twoA = new Hardiness("2a");
        Hardiness twoB = new Hardiness("2b");
        Hardiness threeA = new Hardiness("3a");
        Hardiness threeB = new Hardiness("3b");
        Hardiness fourA = new Hardiness("4a");
        Hardiness fourB = new Hardiness("4b");
        Hardiness fiveA = new Hardiness("5a");
        Hardiness fiveB = new Hardiness("5b");
        Hardiness sixA = new Hardiness("6a");
        Hardiness sixB = new Hardiness("6b");
        Hardiness sevenA = new Hardiness("7a");
        Hardiness sevenB = new Hardiness("7b");
        Hardiness eightA = new Hardiness("8a");
        Hardiness eightB = new Hardiness("8b");
        Hardiness nineA = new Hardiness("9a");
        Hardiness nineB = new Hardiness("9b");
        Hardiness tenA = new Hardiness("10a");
        Hardiness tenB = new Hardiness("10b");
        Hardiness elevenA = new Hardiness("11a");
        Hardiness elevenB = new Hardiness("11b");
        Hardiness twelveA = new Hardiness("12a");
        Hardiness twelveB = new Hardiness("12b");
        Hardiness thirteenA = new Hardiness("13a");
        Hardiness thirteenB = new Hardiness("13b");
        hardStore.save(oneA);
        hardStore.save(oneB);
        hardStore.save(twoA);
        hardStore.save(twoB);
        hardStore.save(threeA);
        hardStore.save(threeB);
        hardStore.save(fourA);
        hardStore.save(fourB);
        hardStore.save(fiveA);
        hardStore.save(fiveB);
        hardStore.save(sixA);
        hardStore.save(sixB);
        hardStore.save(sevenA);
        hardStore.save(sevenB);
        hardStore.save(eightA);
        hardStore.save(eightB);
        hardStore.save(nineA);
        hardStore.save(nineB);
        hardStore.save(tenA);
        hardStore.save(tenB);
        hardStore.save(elevenA);
        hardStore.save(elevenB);
        hardStore.save(twelveA);
        hardStore.save(twelveB);
        hardStore.save(thirteenA);
        hardStore.save(thirteenB);

        Type flower = new Type("Flower", "some");
        Type fruit = new Type("Fruit", "some");
        Type vegetable = new Type("Vegetable", "some");
        typeStore.save(flower);
        typeStore.save(fruit);
        typeStore.save(vegetable);

        Plant Daisy = new Plant("Daisy", "is a common European species of the family Asteraceae, often considered the archetypal species of that name. To distinguish this species from other daisies, it is sometimes qualified as common daisy, lawn daisy or English daisy.", flower,"https://cdn.pixabay.com/photo/2015/04/19/08/32/marguerite-729510_960_720.jpg",oneA,oneB);
        Plant Strawberry = new Plant("Strawberry", "is a widely grown hybrid species of the genus Fragaria, collectively known as the strawberries, which are cultivated worldwide for their fruit. The fruit is widely appreciated for its characteristic aroma, bright red color, juicy texture, and sweetness.", fruit,"https://cdn.pixabay.com/photo/2018/04/29/11/54/strawberries-3359755_960_720.jpg", twoA, twoB,threeA, threeB, fourA, fourB, fiveA, fiveB, sixA, sixB, sevenA, sevenB, eightA, eightB, nineA, nineB, tenA, tenB);
        Plant Corn = new Plant("Corn", "  is a cereal grain first domesticated by indigenous peoples in southern Mexico about 10,000 years ago. The leafy stalk of the plant produces pollen inflorescences and separate ovuliferous inflorescences called ears that yield kernels or seeds, which are fruits", vegetable,"https://cdn.pixabay.com/photo/2018/09/26/21/24/corn-3705687_960_720.jpg",oneA);
        Plant Potato = new Plant("Potato", "The potato is a starchy tuber of the plant Solanum tuberosum and is a root vegetable native to the Americas, with the plant itself being a perennial in the nightshade family Solanaceae.", vegetable,"https://cdn.pixabay.com/photo/2016/08/11/08/43/potatoes-1585060_960_720.jpg", oneA, oneB, twoA, twoB,threeA, threeB, fourA, fourB, fiveA, fiveB, sixA, sixB, sevenA, sevenB);
        Plant Cabbage = new Plant("Cabbage", "Cabbage, comprising several cultivars of Brassica oleracea, is a leafy green, red (purple), or white (pale green) biennial plant grown as an annual vegetable crop for its dense-leaved heads. ", vegetable,"https://cdn.pixabay.com/photo/2017/09/01/19/20/white-cabbage-2705228_960_720.jpg", oneA, oneB, twoA, twoB,threeA, threeB, fourA, fourB, fiveA, fiveB, sixA, sixB, sevenA, sevenB, eightA, eightB, nineA, nineB);
        Plant Apple = new Plant("Apple", "An apple is an edible fruit produced by an apple tree (Malus domestica). Apple trees are cultivated worldwide and are the most widely grown species in the genus Malus. The tree originated in Central Asia, where its wild ancestor, Malus sieversii, is still found today.", fruit, "https://cdn.pixabay.com/photo/2014/10/15/22/06/apples-490474_960_720.jpg", threeA, threeB, fourA, fourB, fiveA,fiveB,sixA,sixB,sevenA,sevenB,eightA,eightB);
        Plant Lily = new Plant("Lily","Lilium (members of which are true lilies) is a genus of herbaceous flowering plants growing from bulbs, all with large prominent flowers.", flower,"https://cdn.pixabay.com/photo/2018/07/03/23/48/lily-3515094_960_720.jpg", fourA,fourB,fiveA,fiveB,sixA,sixB,sevenA,sevenB,eightA,eightB,nineA,nineB);
        Plant Okra = new Plant("Okra", "Abelmoschus esculentusis is a flowering plant in the mallow family. It is valued for its edible green seed pods.", fruit, "https://cdn.pixabay.com/photo/2019/11/21/08/53/flower-4642095_960_720.jpg",sixA,sixB,sevenA,sevenB,eightA,eightB,nineA,nineB,tenA,tenB,elevenA,elevenB);
        Plant Jalapeno = new Plant("Jalapeño", "is a medium-sized chile pepper pod type cultivar of the species Capsicum annuum. It can have a range of pungency, with Scoville heat units of 3,500 to 8,000",vegetable, "https://cdn.pixabay.com/photo/2015/06/22/21/58/chilli-818080_960_720.jpg",fiveA,fiveB,sixA,sixB,sevenA,sevenB,eightA,eightB,nineA,nineB,tenA,tenB,elevenA,elevenB,twelveA,twelveB,thirteenA,thirteenB);
        Plant Cactus = new Plant("Cactus", " is a member of the plant family Cactaceae, a family comprising about 127 genera with some 1750 known species of the order Caryophyllales", flower, "https://cdn.pixabay.com/photo/2019/05/03/15/13/cactus-4176104_960_720.jpg", tenA,tenB,elevenA,elevenB,twelveA,twelveB,thirteenA,thirteenB);
        Plant Lotus = new Plant ("Lotus", " is one of two extant species of aquatic plant in the family Nelumbonaceae. The lotus is one of the hardiest adapting plants", flower, "https://cdn.pixabay.com/photo/2014/02/12/09/41/water-lily-264588_960_720.jpg",fourA,fourB,fiveA,fiveB,sixA,sixB,sevenA,sevenB,eightA,eightB,nineA,nineB,tenA,tenB,elevenA,elevenB,twelveA,twelveB,thirteenA,thirteenB);
        Plant Agave = new Plant("Agave", "a very hardy species if protected from winter moisture when temperatures fall below 20 degrees F.",flower,"https://cdn.pixabay.com/photo/2017/12/11/11/40/agave-parryi-3011989_1280.jpg",fiveA,fiveB,sixA,sixB,sevenA,sevenB,eightA,eightB,nineA,nineB);
        Plant BB = new Plant("Blushing Bridesmaid","This is the perfect plant for naturalizing in moist, woodland areas where its extensive root system will spread as far as it is allowed.",flower,"https://wgi-img.s3.amazonaws.com/VarietyImage/f079da1a651ff5b3df24e28fe44b250c.jpg",fourA,fourB,fiveA,fiveB,sixA,sixB,sevenA,sevenB,eightA,eightB);
        Plant Achillea = new Plant("Achillea","These plants typically have frilly, hairy, aromatic leaves. The plants show large, flat clusters of small flowers at the top of the stem.",flower,"https://cdn.pixabay.com/photo/2017/06/23/11/20/plant-2434333__480.jpg",fiveA,fiveB,sixA,sixB,sevenA,sevenB,eightA,eightB);
        Plant BC = new Plant("Black Scallop","A great year round plant because of it's beautiful shiny dark plum colored foliage (almost black by the early fall) and deep purple flowers in late Spring.",flower,"https://cdn.pixabay.com/photo/2020/04/26/15/01/dead-nettle-5095655_1280.jpg",threeA,threeB,fourA,fourB,fiveA,fiveB,sixA,sixB,sevenA,sevenB,eightA,eightB);

        plantStore.save(Daisy);
        plantStore.save(Strawberry);
        plantStore.save(Corn);
        plantStore.save(Potato);
        plantStore.save(Cabbage);
        plantStore.save(Apple);
        plantStore.save(Lily);
        plantStore.save(Okra);
        plantStore.save(Jalapeno);
        plantStore.save(Cactus);
        plantStore.save(Lotus);
        plantStore.save(Agave);
        plantStore.save(BB);
        plantStore.save(Achillea);
        plantStore.save(BC);



    }




}
