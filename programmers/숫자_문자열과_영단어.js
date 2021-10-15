const solution = s => {
    const NUMBERS = ['zero', 'one', 'two', 'three', 'four', 'five', 'six', 'seven', 'eight', 'nine'];
    
    for(let i = 0; i < NUMBERS.length; i++){
        while(s.includes(NUMBERS[i])) {
            s = s.replace(NUMBERS[i], i);
        }
        if(!isNaN(+s)) { break; }
    }

    return +s;
}