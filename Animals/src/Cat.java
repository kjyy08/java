public class Cat extends Animal{
    Cat(String name, int hp, int damage, float moveSpeed, Vector2 position){
        setName(name);
        setHp(hp);
        setDamage(damage);
        setMoveSpeed(moveSpeed);
        setPosition(position);
    }

    @Override
    public String attack() {
        return getName() + ": 할퀴기!!!";
    }

    @Override
    public String move(String direction) {
        return "꽁꽁 얼어붙은 한강 위로 " + super.move(direction) + "합니다";
    }
}
