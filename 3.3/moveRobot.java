public static void moveRobot(Robot robot, int toX, int toY) {
    int x = robot.getX();
        int y = robot.getY();
        if (x != toX) {
            if (x < toX) {
                while (robot.getDirection() != Direction.RIGHT) {
                    robot.turnRight();
                }
            } else {
                while (robot.getDirection() != Direction.LEFT) {
                    robot.turnLeft();
                }
            }
            for (int i = 0; i < Math.abs(toX - x); i++) {
                robot.stepForward();
            }
        }
        if (y != toY) {
            if (y < toY) {
                while (robot.getDirection() != Direction.UP) {
                    robot.turnRight();
                }
            } else {
                while (robot.getDirection() != Direction.DOWN) {
                    robot.turnRight();
                }
            }
            for (int i = 0; i < Math.abs(toY - y); i++) {
                robot.stepForward();
            }
        }
}