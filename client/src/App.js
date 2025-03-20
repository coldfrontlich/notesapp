import React from 'react'
import NoteList from './components/NoteList'
import './styles/App.scss'

function App() {

  return (
    <div className='app'>
      <h1>Мои заметки</h1>
      <NoteList />
    </div>
  )
}

export default App
