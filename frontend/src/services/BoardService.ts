import Board from "../entities/Board";

export default interface BoardService {

}


export type SaveColumnInput = {
    idBoard: number,
    name: string,
    hasEstimative: boolean
}