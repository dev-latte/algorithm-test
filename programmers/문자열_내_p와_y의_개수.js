const solution = (s) => {
    let countP = 0;
    let countY = 0;
    
    for(let i = 0; i < s.length; i++) {
        const letter = s[i];
        if(letter === 'P' || letter === 'p') { countP++; }
        else if(letter === 'Y' || letter === 'y') { countY++; }
    }
    
    return countP === countY;
}