import Board from "../entities/Board";
import HttpClient from "../infra/http/HttpClient";
import BoardService, { SaveColumnInput } from "./BoardService";

export default class BoardServiceHttp implements BoardService {

    constructor(readonly httpClient: HttpClient, readonly baseUrl: string) {
        
    }
  

}
