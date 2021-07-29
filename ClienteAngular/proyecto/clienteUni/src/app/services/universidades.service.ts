import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';
import { Universidades } from '../domain/universidades';

@Injectable({
  providedIn: 'root'
})
export class UniversidadesService {

  

   constructor(private http: HttpClient) { }
  guardaruniversidades(universidad:Universidades): Observable<any>{
    const url= environment.WS_PATH+'/universidades/registrar'
    return this.http.put<any>(url, universidad)
}

getUniversidades(): Observable<any>{
  const url= environment.WS_PATH+'/universidades/listarUni'
  return this.http.get<any>(url)
}
}
