import {Injectable} from '@angular/core';

@Injectable()
export class UserService{

users = [
  {_id: 123,  username: 'kim', password: 'kimpassword', name: 'KIM'},
  {_id: 124,  username: 'tom', password: 'tompassword', name: 'TOM'},
  {_id: 125, username: 'amy', password: 'amypassword', name: 'AMY'}
];

findUserByCredentials(username: String, password: String){
  for(let i = 0; i < this.users.length; i++){
    const user = this.users[i];
    if(username === user.username && password === user.password)
      return user;
  }
  return null;
}
}
