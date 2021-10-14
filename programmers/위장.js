const solution = (clothes) => {
    const kinds = new Map();
    clothes.forEach(el => {
        const count = kinds.has(el[1]) ? kinds.get(el[1]) : 1;
        kinds.set(el[1], count + 1);
    });
    
    let sum = 1;
    kinds.forEach(value => sum *= value); 
    
    return sum - 1;
}