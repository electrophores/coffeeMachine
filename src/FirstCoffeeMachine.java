class FirstCoffeeMachine extends coffeeMachine {
    @Override
    Coffee getCoffee(String coffeeType) {
        switch (coffeeType.toLowerCase()) {
            case "espresso": return new Espresso();
            case "americano": return new Americano();
            case "cappuccino": return new Cappuccino();
            case "latte": return new Latte();
            default: throw new IllegalArgumentException("Неизвестный тип кофе: " + coffeeType);
        }
    }
}