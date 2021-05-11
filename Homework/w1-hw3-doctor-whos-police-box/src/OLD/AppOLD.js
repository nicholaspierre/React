import TopNav from './TopNav';
import LeftNav from './LeftNav';
import MainContent from './MainContent';

function App() {
    return (
        <div>
            <div>
                <TopNav />
            </div>
            <div className="MainContent">
                <LeftNav fname='Nicholas' /><MainContent />
            </div>
        </div>
    );
}

export default App;