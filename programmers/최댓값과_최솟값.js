const solution = (s) => {
    const numArr = s.split(" ").map((el) => +el);
    return `${Math.min(...numArr)} ${Math.max(...numArr)}`;
}