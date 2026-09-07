type Team="red" | "yellow" | "blue"
type Hearlth = 1 | 5 | 10

interface Player {
    nickname: string,
    team: Team,
    health : Hearlth
}