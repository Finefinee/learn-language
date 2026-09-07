// type Hap = {
//     (a: number, b: number) : number,
//     (a: number, b: string) : number
// }

// const hap: Hap = (a, b) => {
//     if (typeof b === "string") {
//         return a;
//     } else {
//         return a + b;
//     }
// }

type Hap = {
    (a: number, b: number) : number,
    (a: number, b: number, c: number) : number
}

const add: Add = (a, b, c?: number) => {
    if (c) {
        return a + b + c
    }
    return a + b
}