const solution = (s) => {
    const start = Math.ceil(s.length/2) - 1;
    const count = (s.length % 2 === 0) ? 2 : 1;
    return s.substr(start, count);
}