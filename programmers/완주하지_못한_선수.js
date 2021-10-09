const solution = (participant, completion) => {
    const map = new Map();
    
    participant.forEach(el => {
       const count = (!map.get(el)) ? 1 : map.get(el) + 1;
       map.set(el, count);
    });
    
    completion.forEach(el => {
        map.set(el, map.get(el) - 1);
        if(map.get(el) === 0) {
            map.delete(el);
        }
    });
    
    // map 객체에 남은 값을 반환
    for (const [key] of map) {
        return key;
    }    
}