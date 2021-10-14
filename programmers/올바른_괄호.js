const solution = (s) => {
    const stack = [];
    return !s.split("").map(el => {
        if (el === "(") { stack.push(el); } 
        else {
            if(!stack.length) { stack.push(el); } 
            else { stack.pop();}
        }
        return stack;
    }).filter(el => el.length).length;
}