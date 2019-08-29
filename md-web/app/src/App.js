import React, { useState, useEffect } from 'react';
import './App.css';


function App() {
  const [users, setUsers] = useState([]);

  async function getUsers() {
    const result = await fetch('/all');
    const json = await result.json();
    console.log(json);
    setUsers(json);
  }

  useEffect(() => { getUsers(); }, []);

  return <ul>
        { users.map(user => (
            <li key={user.login}>
              {user.login} : {user.firstname} {user.lastname}
            </li>
        ))}
      </ul>;
}

export default App;
