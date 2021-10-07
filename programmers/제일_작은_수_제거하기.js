function solution(arr) {
    if(arr.length <= 1) return [-1];
    const min = arr.reduce((a, b) => a < b ? a : b);

    return arr.filter(num => num !== min);
}