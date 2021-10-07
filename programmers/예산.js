const solution = (d, budget) => {
    return d.sort((a, b) => a - b)
            .map(assigned => {
                if((budget -= assigned) < 0) { return false; }
                return true;
            })
            .filter(el => el).length;
}