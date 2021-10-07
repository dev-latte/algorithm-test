const solution = (strings, n) => {
    return strings.sort((a, b) => {
        if (a[n] < b[n]) { return -1; }
        if (b[n] < a[n]) { return 1; }
        if (a[n] === b[n]) {
            return a.localeCompare(b);
        }
    });
}