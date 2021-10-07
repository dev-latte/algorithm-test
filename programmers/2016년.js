const solution = (a, b) => {
    return weekDayFromNum(new Date(`2016-${a}-${b}`).getDay());
}

const weekDayFromNum = (num) => {
    const dateArr = ["SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"];
    return dateArr[num];
}