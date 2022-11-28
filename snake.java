package Snake;

class Snake {
	static final int MAX_INPUT = 100000000;

	Coordinate[] coordinateArray;
	int numberOfElements;

	CoordinateRow() {
		coordinateArray = new Coordinate[MAX_INPUT];
		numberOfElements = 0;
	}
	void addCoordinateAtTheBack(Coordinate coordinate) {
		coordinateArray[numberOfElements] = coordinate;
		numberOfElements ++;
	}
	void moveSnake(Coordinate coordinate) {
		for(int i = numberOfElements; i >= 1; i--) {
			coordinateArray[i] = coordinateArray[i-1];
		}
		coordinateArray[0] = coordinate;
	}
}
