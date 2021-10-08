const solution = (nums) => {
    const max = Math.floor(nums.length/2);
    let kinds = new Set(nums);

    return (kinds.size < max) ? kinds.size : max;
}