
class Clock {

    int hours = 12;
    int minutes = 0;

    void next() {

        if (minutes >= 59) {
            minutes = 0;
            hours += 1;

            if (hours >= 13) {
                hours = 1;
            }
        } else {
            minutes += 1;
        }

    }
}
