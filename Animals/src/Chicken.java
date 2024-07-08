public class Chicken extends Animal{
    Chicken(String name, int hp, int damage, float moveSpeed, Vector2 position){
        setName(name);
        setHp(hp);
        setDamage(damage);
        setMoveSpeed(moveSpeed);
        setPosition(position);
    }

    @Override
    public String attack() {
        return getName() + ": 날개짓하기!!!";
    }

    @Override
    public String move(String direction) {
        return super.move(direction) + "합니다";
    }
}
