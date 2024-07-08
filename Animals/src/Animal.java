abstract class Animal {
    protected String name;
    protected int hp;
    protected int damage;
    protected float moveSpeed;
    protected Vector2 position;

    public Animal(){
        name = "";
        hp = 0;
        damage = 0;
        moveSpeed = 0.0f;
    }

    //  Getter and Setter  //
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public float getMoveSpeed() {
        return moveSpeed;
    }

    public void setMoveSpeed(float moveSpeed) {
        this.moveSpeed = moveSpeed;
    }

    public String getPosition(){
        return "x: " + position.x + ", y: " + position.y;
    }

    public void setPosition(float x, float y){
        position.x = x;
        position.y = y;
    }

    public void setPosition(Vector2 position){
        this.position = position;
    }

    //  동물의 현재 정보 출력
    public String show() {
        return "이름 : " + name + "\n체력 : " + hp + "\n공격력 : " + damage +
                "\n이동속도 : " + moveSpeed + "\n좌표 : " + getPosition() + "\n공격 패턴 => " + attack();
    }
    //  동물 이동 함수
    //  입력받은 방향으로 이동속도만큼 좌표 이동
    public String move(String direction){
        switch (direction) {
            case "up":
                position.up(moveSpeed);
                break;

            case "down":
                position.down(moveSpeed);
                break;

            case "right":
                position.right(moveSpeed);
                break;

            case "left":
                position.left(moveSpeed);
                break;
        }

        return name + ": " + direction + "방향으로 " + moveSpeed + "만큼 이동";
    }
    //  공격 패턴 출력 함수
    //  추상 메서드로 자식 클래스에서 구현
    abstract String attack();
}
