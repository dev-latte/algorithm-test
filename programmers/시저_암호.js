const solution = (s, n) => {
    const alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    
    return s.split("").map(letter => {
        const index = alphabet.indexOf(letter);
        if(index === -1){ return " "; }
        
        if(index < 26) {
            return 26 <= index + n ? alphabet[index + n - 26] : alphabet[index + n];
        }
        
        return alphabet.length-1 < index + n ? alphabet[index + n - 26] : alphabet[index + n];
    }).join("");
}