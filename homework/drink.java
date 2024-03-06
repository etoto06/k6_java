package homework;

abstract class Drinks {
    public abstract void drink();
}

class Juice extends Drinks {
    @Override
    public void drink() {
        System.out.println("주스를 마십니다.");
    }
}

class Coffee extends Drinks {
    @Override
    public void drink() {
        System.out.println("커피를 마십니다.");
    }
}

class Beer extends Drinks {
    @Override
    public void drink() {
        System.out.println("맥주를 마십니다.");
    }
}

class Water extends Drinks {
    @Override
    public void drink() {
        System.out.println("물을 마십니다.");
    }
}

class Tea extends Drinks {
    @Override
    public void drink() {
        System.out.println("차를 마십니다.");
    }
}

public class Main {
    public static void main(String[] args) {
        Drinks[] drinks = { new Juice(), new Coffee(), new Beer(), new Water(), new Tea() };
        
        for (Drinks drink : drinks) {
            drink.drink();
        }
    }
}
