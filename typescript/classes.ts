class Player {
    constructor(
        private firstName: string, 
        private lastName: string,
        public  nickname: string
    ) {}
}

const nicoPlayer = new Player("nico", "las", "니꼬");