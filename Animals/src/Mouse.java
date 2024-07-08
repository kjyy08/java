public class Mouse extends Animal{
    Mouse(String name, int hp, int damage, float moveSpeed, Vector2 position){
        setName(name);
        setHp(hp);
        setDamage(damage);
        setMoveSpeed(moveSpeed);
        setPosition(position);
    }

    @Override
    public String attack() {
        return getName() + ": 도망가버리기!!!";
    }

    @Override
    public String move(String direction) {
        return super.move(direction) + "합니다";
    }
}
