package race.domian;

import java.util.Objects;

public class Position {
    private  int position;
    public static final int START_POSITION = 0;

    public Position(int START_POSITION) {
        this.position = validate(START_POSITION);
    }

    private int validate(int position) {
        if (position < 0) {
            throw new IllegalArgumentException("position 은 음수값을 가질 수 없습니다.");
        }
        return position;
    }

    public int getPosition() {
        return position;
    }


    public boolean isMaxPosition(int maxPosition) {
        return position == maxPosition;
    }

    public void move() {
        position = position + 1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Position)) {
            return false;
        }
        Position position1 = (Position) o;
        return position == position1.position;
    }

    @Override
    public int hashCode() {
        return Objects.hash(position);
    }

    public int compare(Position position) {
        return Integer.compare(this.position, position.getPosition());
    }
}
