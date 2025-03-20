import React, { useState } from 'react'
import NoteList from './components/NoteList'
import NoteForm from './components/NoteForm'
import './styles/App.scss'

function App() {
	const [refresh, setRefresh] = useState(false)

	const handleNoteCreated = () => {
		setRefresh(!refresh)
	}

  return (
    <div className='app'>
      <h1>Мои заметки</h1>
      <NoteForm onNoteCreated={handleNoteCreated} />
      <NoteList />
    </div>
  )
}

export default App
